package HackatonaPortoCred.DTO;

public class ProcessDTO {

    private String proposta;
    private String situacao;

    public ProcessDTO(String proposta, String situacao) {
        this.proposta = proposta;
        this.situacao = situacao;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
