package model;

import java.io.Serializable;

public class TEST implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.test
     *
     * @mbggenerated
     */
    private String test;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.aa
     *
     * @mbggenerated
     */
    private String aa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TEST
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.id
     *
     * @return the value of TEST.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.id
     *
     * @param id the value for TEST.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.test
     *
     * @return the value of TEST.test
     *
     * @mbggenerated
     */
    public String getTest() {
        return test;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.test
     *
     * @param test the value for TEST.test
     *
     * @mbggenerated
     */
    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.aa
     *
     * @return the value of TEST.aa
     *
     * @mbggenerated
     */
    public String getAa() {
        return aa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.aa
     *
     * @param aa the value for TEST.aa
     *
     * @mbggenerated
     */
    public void setAa(String aa) {
        this.aa = aa == null ? null : aa.trim();
    }
}