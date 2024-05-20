package org.ikopranov.service.factory;

import org.eclipse.jetty.server.Server;

public interface JettyServerFactory {
  
  Server create();
  
  Server create(int port);

}
