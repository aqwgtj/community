package life.shinidie.community.mapper;

import life.shinidie.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
//    @Insert("insert into (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate),#{gmtModified},#{creator},#{tag})")
//@Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate),#{gmtModified},#{creator},#{tag})")
  @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
void create(Question question);

  @Select("select * from question")
    List<Question> list();
}

