package com.forum.model.dao;

import com.forum.model.entity.Tip;
import com.forum.model.entity.TipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    long countByExample(TipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int deleteByExample(TipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int deleteByPrimaryKey(Integer tipid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int insert(Tip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int insertSelective(Tip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    List<Tip> selectByExample(TipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    Tip selectByPrimaryKey(Integer tipid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") Tip record, @Param("example") TipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int updateByExample(@Param("record") Tip record, @Param("example") TipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int updateByPrimaryKeySelective(Tip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tip
     *
     * @mbg.generated Tue Sep 22 16:10:00 CST 2020
     */
    int updateByPrimaryKey(Tip record);
}