package edu.ahut.mapper;

import edu.ahut.entity.Janwords;
import edu.ahut.entity.JanwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JanwordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    long countByExample(JanwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    int deleteByExample(JanwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    int insert(Janwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    int insertSelective(Janwords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    List<Janwords> selectByExample(JanwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") Janwords record, @Param("example") JanwordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table janwords
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    int updateByExample(@Param("record") Janwords record, @Param("example") JanwordsExample example);

    List<Janwords> translate(Janwords janwords);

    List<Janwords> tips(Janwords janwords);
}