package com.example.PC;

import ch.qos.logback.core.model.ComponentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.awt.event.ComponentEvent;

@Mapper(componentModel = "spring")
public interface PcMapper {
   //PcMapper INSTANCE = Mappers.getMapper(PcMapper.class);
/*   @Mapping(source = "cpu", target = "cpux")
   @Mapping(source = "cpuSpeed", target = "cpuSpeedx")
   @Mapping(source = "ram", target = "ramx")*/
   PcDTO pcToDTO (PcHardware pcHardware);
/*   @Mapping(source = "cpu", target = "cpu")
   @Mapping(source = "cpuSpeed", target = "cpuSpeed")
   @Mapping(source = "ram", target = "ram")*/
   PcHardware pcDTOtoPc (PcDTO pcDTO);


}
