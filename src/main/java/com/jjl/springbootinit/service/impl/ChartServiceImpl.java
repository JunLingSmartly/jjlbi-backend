package com.jjl.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jjl.springbootinit.model.entity.Chart;
import com.jjl.springbootinit.service.ChartService;
import com.jjl.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




