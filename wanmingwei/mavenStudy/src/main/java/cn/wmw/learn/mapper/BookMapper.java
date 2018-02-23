package cn.wmw.learn.mapper;

import cn.wmw.learn.domain.BookDO;
import cn.wmw.learn.domain.condition.BookCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int countByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int deleteByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int deleteByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int insert(BookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int insertSelective(BookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    List<BookDO> selectByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    BookDO selectByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") BookDO record, @Param("example") BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int updateByExample(@Param("record") BookDO record, @Param("example") BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int updateByPrimaryKeySelective(BookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 16:51:40 CST 2018
     */
    int updateByPrimaryKey(BookDO record);
}