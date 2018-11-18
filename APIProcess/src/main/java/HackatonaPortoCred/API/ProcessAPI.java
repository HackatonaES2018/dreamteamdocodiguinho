package HackatonaPortoCred.API;

import HackatonaPortoCred.DTO.ClienteDTO;
import HackatonaPortoCred.DTO.ProcessDTO;
import HackatonaPortoCred.Service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/process")
public class ProcessAPI {

    @Autowired
    private ProcessService processService;

    public ProcessAPI(ProcessService processService) {
        this.processService = processService;
    }

    @PostMapping("/enviaDados")
    public ResponseEntity<ProcessDTO> enviaDados(@RequestBody ClienteDTO clienteDTO) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://sb-api.portocred.com.br/credito-pessoal-demo/v1/propostas" +
                "/be271213-68fc-39e6-b53f-b5e0be517954";

        ProcessDTO processDTO = restTemplate.postForObject(url, clienteDTO, ProcessDTO.class);
        return ResponseEntity.ok(processDTO);
    }
}
