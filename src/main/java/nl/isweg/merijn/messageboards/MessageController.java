package nl.isweg.merijn.messageboards;

import lombok.extern.slf4j.Slf4j;
import nl.isweg.merijn.messageboards.model.Color;
import nl.isweg.merijn.messageboards.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created by meriadoc on 4/6/17.
 */
@Slf4j
@RestController
public class MessageController {

    private static Random RND = new Random();

    private Message message = Message.builder().line1("hello").line2("world " + RND.nextInt(65536))
            .color(Color.builder()
                    .r(RND.nextInt(100))
                    .g(RND.nextInt(100))
                    .b(RND.nextInt(100)).build()
            ).build();

    @RequestMapping("/")
    public String index() {
        log.info("index requested, will send greetings");
        return "Greetings";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/now")
    public Message currentMessage() {
        log.info("/now requested, returning current message {}", this.message);
        return message;
    }


    @RequestMapping(method = RequestMethod.POST, path = "/msg", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String setMessage(@RequestBody Message message) {
        log.info("set message to: {}", message);
        this.message = message;
        return "message set.";
    }
}
