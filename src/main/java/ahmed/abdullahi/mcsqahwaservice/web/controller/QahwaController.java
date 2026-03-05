package ahmed.abdullahi.mcsqahwaservice.web.controller;


import ahmed.abdullahi.mcsqahwaservice.web.model.QahwaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/qahwa")
public class QahwaController {

    @GetMapping("/{qahwaId}")
    public ResponseEntity<QahwaDto> getQahwaById(@PathVariable("qahwaId") UUID qahwaId){
        //todo impl
        return new ResponseEntity<>(QahwaDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewQahwa(@RequestBody QahwaDto qahwaDto){

        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{qahwaId}")
    public ResponseEntity updateQahwaById(@PathVariable("qahwaId") UUID qahwaId, @RequestBody QahwaDto qahwaDto){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
