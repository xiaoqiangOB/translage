package edu.ahut.mapper;

import edu.ahut.entity.Enwords;
import edu.ahut.entity.EnwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnwordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    long countByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    int deleteByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    int insert(Enwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    int insertSelective(Enwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    List<Enwords> selectByExample(EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Enwords record, @Param("example") EnwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    int updateByExample(@Param("record") Enwords record, @Param("example") EnwordsExample example);

    List<Enwords> tips(Enwords enwords);

    List<Enwords> translate(Enwords enwords);
}