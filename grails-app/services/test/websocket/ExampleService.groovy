package test.websocket

import org.springframework.messaging.simp.SimpMessagingTemplate

class ExampleService {

    SimpMessagingTemplate brokerMessagingTemplate

    void hello() {
        brokerMessagingTemplate.convertAndSendToUser("myTargetUsername", "/queue/hello", "hello, target user!")
    }

}