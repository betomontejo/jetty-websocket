package websocket.controller;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
/*
 To test the handshake:
 curl -i -N -H "Host: server.example.com" -H "Upgrade: websocket" -H "Connection: Upgrade" -H "Sec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==" -H "Origin: http://example.com" -H "Sec-WebSocket-Protocol: chat, superchat" -H "Sec-WebSocket-Version: 13" "Origin: http://localhost" http://localhost:8080/echo
 */
@ServerEndpoint(value = "/echo")
public class EchoController {

    @OnMessage
    public String onMessage(String message, Session session) {
        return message;
    }
}
