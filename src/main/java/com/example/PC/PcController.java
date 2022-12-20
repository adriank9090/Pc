package com.example.PC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PcController {

    PcService pcService;

    @Autowired
    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @PostMapping("/api/pc/new")
    public void save(@RequestBody PcHardware pcHardware) {
        pcService.save(pcHardware);
    }

    @PostMapping("/api/pc/new2")
    public void saveAll(@RequestBody List<PcHardware> pcHardware) {
        pcService.saveAll(pcHardware);
    }

    @GetMapping("/api/pc/{id}")
    public PcDTO pcDTO(@PathVariable Long id) {
        return pcService.findById(id);
    }


}
