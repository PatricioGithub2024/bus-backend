package com.example.retoPractico_CivaJoseAhumada.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HikariCpConfig {

    @Value("${DB_BUSCIVA_URL}")
    private String dbBusCivaUrl;
    @Value("${DB_BUSCIVA_USER}")
    private String dbBusCivaUser;
    @Value("${DB_BUSCIVA_PASS}")
    private String dbBusCivaPass;
    @Value("${DB_BUSCIVA_DRIVER}")
    private String dbBusCivaDriver;

    @Bean
    public HikariDataSource hikariDataSource() {

        HikariConfig config = new HikariConfig();

        /**
         * Configurar propiedad de conexion a BD
         */
        config.setJdbcUrl(dbBusCivaUrl);
        config.setUsername(dbBusCivaUser);
        config.setPassword(dbBusCivaPass);
        config.setDriverClassName(dbBusCivaDriver);

        /**
         * Configurar propiedades del pool de HikariCP
         * - MaximumPoolSize: Máximo # de conexiones del pool.
         * - MinimumIdle: Mínimo # de conexiones inactivas del pool.
         * - IdleTimeout: Tiempo máximo de espera para
         *      eliminar una conexión inactiva.
         * - ConnectionTimeout: Tiempo máximo de espera
         *      para conectarse a la BD.
         */
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(300000);
        config.setConnectionTimeout(30000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);

    }


}
