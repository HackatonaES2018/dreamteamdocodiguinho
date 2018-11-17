package HackatonaPortoCred.ConfigDatabase;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMongoDB {

    private MongoClientURI uri = new MongoClientURI("mongodb://codiguinho2018:" +
            "GCcluVgUZ0OSorMVqRYL6t5S0y6EIgIRJCxnHUmTox2HjgSVm94Jm7txsx7GdANv3c5lJT8L8jRrzSm0iPuBUA==" +
            "@codiguinho2018.documents.azure.com:10255/?ssl=true&replicaSet=globaldb");

    @Bean
    public MongoCollection<Document> mongoClient() {
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("codiguinho2018");
        MongoCollection<Document> collection = database.getCollection("propostas");
        return collection;
    }
}
