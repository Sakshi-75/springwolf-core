package io.github.stavshamir.springwolf.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

/**
 * This class is used to create metadata for auto-completion in spring configuration properties/yaml by using
 * the spring-boot-configuration-processor.
 */
@Configuration
@ConfigurationProperties(prefix = SpringwolfAmqpConfigConstants.SPRINGWOLF_AMQP_CONFIG_PREFIX)
@ConditionalOnProperty(name = SpringwolfConfigConstants.SPRINGWOLF_ENABLED, matchIfMissing = true)
@Getter
@Setter
public class SpringwolfAmqpConfigProperties {

    @Nullable
    private Publishing publishing;

    @Nullable
    private Scanner scanner;

    @Getter
    @Setter
    public static class Publishing {

        /**
         * Enables/Disables the possibility to publish messages through springwolf on the configured amqp instance.
         */
        private boolean enabled = false;
    }

    @Getter
    @Setter
    public static class Scanner {

        private static RabbitListener rabbitListener;

        @Getter
        @Setter
        public static class RabbitListener {

            /**
             * This mirrors the ConfigConstant {@see SpringwolfAmqpConfigConstants#SPRINGWOLF_SCANNER_RABBIT_LISTENER_ENABLED}
             */
            private boolean enabled = true;
        }
    }
}
