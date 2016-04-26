package org.wso2.carbon.identity.application.authentication.framework.inbound;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by yasiru on 4/20/16.
 */
public interface InboundRequestFactoryInterface {
    void init(Properties properties) throws FrameworkRuntimeException;

    String getName();

    int getPriority();

    boolean canHandle(HttpServletRequest request, HttpServletResponse response)
            throws FrameworkRuntimeException;

    InboundRequest create(HttpServletRequest request, HttpServletResponse response);
}
