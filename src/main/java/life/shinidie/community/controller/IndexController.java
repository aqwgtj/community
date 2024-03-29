package life.shinidie.community.controller;

import life.shinidie.community.dto.QuestionDTO;
import life.shinidie.community.mapper.QuestionMapper;
import life.shinidie.community.mapper.UserMapper;
import life.shinidie.community.model.Question;
import life.shinidie.community.model.User;
import life.shinidie.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0)
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }

        List<QuestionDTO> questionList = questionService.list();
        for (QuestionDTO questionDTO : questionList) {
            questionDTO.setDescription("reset");
        }
        model.addAttribute("questions", questionList);
        return "index";
    }
}
