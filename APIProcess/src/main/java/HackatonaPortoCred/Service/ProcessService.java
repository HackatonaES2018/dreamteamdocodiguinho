package HackatonaPortoCred.Service;


import HackatonaPortoCred.DTO.ClienteDTO;
import HackatonaPortoCred.Repository.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepository processRepository;

    public ResponseEntity insertClienteDTO(ClienteDTO clienteDTO){
        return ResponseEntity.ok(processRepository);
    }
}
