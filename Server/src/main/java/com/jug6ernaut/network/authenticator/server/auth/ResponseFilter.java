package com.jug6ernaut.network.authenticator.server.auth;

/**
 * Created by williamwebb on 2/13/14.
 */

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class ResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {

//        SecurityContext context = requestContext.getSecurityContext();
//        if(context != null && context instanceof UserContext){
//            UserContext userContext = (UserContext)context;
//            Credentials user = userContext.getUser();
//            if(user!=null && user.getAuthToken() != null){
//               responseContext.getHeaders().add("Authorization", user.getAuthToken());
//            }
//        }

    }
}
