package dao;

import java.util.List;
import model.TEST;
import model.TESTCriteria;
import org.apache.ibatis.annotations.Param;

public interface TESTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int countByExample(TESTCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int deleteByExample(TESTCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int insert(TEST record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int insertSelective(TEST record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    List<TEST> selectByExample(TESTCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    TEST selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TEST record, @Param("example") TESTCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TEST record, @Param("example") TESTCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TEST record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TEST record);
}