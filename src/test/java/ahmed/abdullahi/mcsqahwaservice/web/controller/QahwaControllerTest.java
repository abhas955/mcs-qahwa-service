package ahmed.abdullahi.mcsqahwaservice.web.controller;

import ahmed.abdullahi.mcsqahwaservice.web.model.QahwaDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QahwaController.class)
class QahwaControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getQahwaById() throws Exception {
        mockMvc.perform(get("/api/v1/qahwa/" + UUID.randomUUID()).accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void saveNewQahwa() throws Exception {
        QahwaDto qahwaDto = QahwaDto.builder().build();
        String qahwaDtoJson = objectMapper.writeValueAsString(qahwaDto);

        mockMvc.perform(post("/api/v1/qahwa")
                .contentType(MediaType.APPLICATION_JSON)
                .content(qahwaDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateQahwaById() throws Exception {
        QahwaDto qahwaDto = QahwaDto.builder().build();
        String qahwaDtoJson = objectMapper.writeValueAsString(qahwaDto);

        mockMvc.perform(put("/api/v1/qahwa/"+ UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(qahwaDtoJson))
                .andExpect(status().isNoContent());

    }
}