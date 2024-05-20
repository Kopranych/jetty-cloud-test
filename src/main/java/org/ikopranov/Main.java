package org.ikopranov;

import org.ikopranov.service.factory.impl.SimpleJettyServerFactory;

public class Main {

  public static void main(String[] args) throws Exception {

    final var jettyServerFactory = new SimpleJettyServerFactory();
    final var server = jettyServerFactory.create();
    server.start();
    server.join();
  }
}