package org.ikopranov.service.factory.impl;

import org.eclipse.jetty.server.Server;
import org.ikopranov.service.factory.JettyServerFactory;

public class SimpleJettyServerFactory implements JettyServerFactory {

  @Override
  public Server create() {
    return create(8080);
  }

  @Override
  public Server create(int port) {
    return new Server(port);
  }
}
