package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.mapper.Sample1Mapper;
import org.zerock.mapper.Sample2Mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class SampleTxServiceImpl implements SampleTxService {

  @Setter(onMethod_ = { @Autowired })
  private Sample1Mapper mapper1;
  
  @Setter(onMethod_ = { @Autowired })
  private Sample2Mapper mapper2;
  
  @Transactional //요것이 트랙잭션 처리 어노테이션
  @Override
  public void addData(String value) { //트랙잭션 처리   둘 다 삽입되든지 아니면 둘 다 안 되든지 하나의 트랙잭션 단위로 묶는다.
    
    log.info("mapper1....................");
    mapper1.insertCol1(value);
    
    log.info("mapper2.....................");
    mapper2.insertCol2(value);
    
    log.info("end..........................");
    
  }

}


