package com.jjl.springbootinit.mapper;

import com.jjl.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @Entity
 */
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String, Object>> queryChartData(String querySql);
}




