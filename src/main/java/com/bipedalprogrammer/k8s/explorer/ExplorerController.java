package com.bipedalprogrammer.k8s.explorer;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;
import java.util.List;

@RestController
public class ExplorerController {
    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public String get(@RequestHeader HttpHeaders httpHeaders) {
        InetSocketAddress hostAddress = httpHeaders.getHost();
        String hostName = hostAddress.getHostName();
        return "{\"data\": {\"hostname\": \""+hostName+"\"}}";
    }
}
