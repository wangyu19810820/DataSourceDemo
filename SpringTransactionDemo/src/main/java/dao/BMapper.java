package dao;

import java.util.List;
import model.B;
import model.BCriteria;
import org.apache.ibatis.annotations.Param;

public interface BMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int countByExample(BCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int deleteByExample(BCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int insert(B record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int insertSelective(B record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    List<B> selectByExample(BCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    B selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") B record, @Param("example") BCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") B record, @Param("example") BCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(B record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table B
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(B record);
}