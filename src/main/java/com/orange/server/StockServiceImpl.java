package com.orange.server;

import com.orange.Stock;
import com.orange.StockQuote;
import com.orange.StockQuoteProviderGrpc;

import java.util.concurrent.ThreadLocalRandom;

public class StockServiceImpl extends StockQuoteProviderGrpc.StockQuoteProviderImplBase {

    @Override
    public void serverSideStreamingGetListStockQuotes(com.orange.Stock request,
                                                      io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
        System.out.println("Request received from client:\n" + request);
        for (int i = 1; i <= 5; i++) {

            StockQuote stockQuote = StockQuote.newBuilder()
                    .setPrice(fetchStockPriceBid(request))
                    .setOfferNumber(i)
                    .setDescription("Price for stock:" + request.getTickerSymbol())
                    .build();
            responseObserver.onNext(stockQuote);
        }
        responseObserver.onCompleted();

    }

    private static double fetchStockPriceBid(Stock stock) {

        return stock.getTickerSymbol()
                .length()
                + ThreadLocalRandom.current()
                .nextDouble(-0.1d, 0.1d);
    }

   /* @Override
    public void serverSideStreamingGetListStockQuotes(

            request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }*/
}

