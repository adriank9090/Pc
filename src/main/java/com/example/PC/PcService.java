package com.example.PC;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcService {

    @Autowired
    private PcMapper pcMapper;

    private PcRepository pcRepository;


@Autowired
    public PcService(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    public List<PcDTO> pcDTOHardwareList(PcHardware pcHardware) {
        List<PcDTO> collect = pcRepository.findAll()
                .stream().map(PcHardware -> pcMapper.pcToDTO(pcHardware))
                .collect(Collectors.toList());
        if (collect.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else {
            return collect;
        }
    }

    public PcDTO findById (Long id) {
        PcHardware pcHardware = pcRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Not found"));
        return pcMapper.pcToDTO(pcHardware);
    }

    public void save(PcHardware pcHardware) {
        pcRepository.save(pcHardware);
    }

    public void saveAll(List<PcHardware> pcHardware) {
        pcRepository.saveAll(pcHardware);
    }


/*    public void saveCheck(PcHardware pcHardware) {
        pcRepository.save(pcHardware);
    }*/


/*        public PcHardware findById (Long id) {
        PcHardware pcHardware = pcRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Not found"));
        return pcHardware;
    }*/
}
