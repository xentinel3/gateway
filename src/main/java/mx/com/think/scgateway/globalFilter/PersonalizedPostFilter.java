package mx.com.think.scgateway.globalFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class PersonalizedPostFilter implements GlobalFilter {
    Logger logger = LoggerFactory.getLogger(PersonalizedPostFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            logger.info("Global Post-filter has been executed");
        }));
    }
}
