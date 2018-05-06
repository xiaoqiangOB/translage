package edu.ahut.mapper;

import edu.ahut.entity.Enwords;
import edu.ahut.entity.EnwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.swing.text.html.parser.Entity;

public interface EnwordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    long countByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    int deleteByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    int insert(Enwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    int insertSelective(Enwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    List<Enwords> selectByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") Enwords record, @Param("example") EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Sun May 06 15:38:54 CST 2018
     */
    int updateByExample(@Param("record") Enwords record, @Param("example") EnwordsExample example);

    List<Enwords> translate(Enwords enwords);

    Enwords queryById(Enwords id);
}