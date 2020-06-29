package com.okta.createverifytokens;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import org.junit.Ignore;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.*;

public class JWTDemoTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void createAndDecodeJWT() throws InvalidKeySpecException, NoSuchAlgorithmException {

        String rut = "11111111";
        Integer user_id = 111111;

        String jwt = JWTDemo.createJWT(
                rut,
                user_id
        );

        logger.info("\n \n TOKEN \n");
        logger.info("\n\n" + jwt.toString() + "\n \n");
    }
}
