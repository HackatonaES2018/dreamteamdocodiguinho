package HackatonaPortoCred.Repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Repository;

@Repository
public class ProcessRepository {

    private MongoCollection<Document> mongoCollection;

    public ProcessRepository(MongoCollection<Document> mongoCollection){
        this.mongoCollection = mongoCollection;
    }


}
