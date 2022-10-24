package com.orange;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: stock.proto")
public final class StockQuoteProviderGrpc {

  private StockQuoteProviderGrpc() {}

  public static final String SERVICE_NAME = "com.orange.StockQuoteProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getServerSideStreamingGetListStockQuotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverSideStreamingGetListStockQuotes",
      requestType = com.orange.Stock.class,
      responseType = com.orange.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getServerSideStreamingGetListStockQuotesMethod() {
    io.grpc.MethodDescriptor<com.orange.Stock, com.orange.StockQuote> getServerSideStreamingGetListStockQuotesMethod;
    if ((getServerSideStreamingGetListStockQuotesMethod = StockQuoteProviderGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
      synchronized (StockQuoteProviderGrpc.class) {
        if ((getServerSideStreamingGetListStockQuotesMethod = StockQuoteProviderGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
          StockQuoteProviderGrpc.getServerSideStreamingGetListStockQuotesMethod = getServerSideStreamingGetListStockQuotesMethod = 
              io.grpc.MethodDescriptor.<com.orange.Stock, com.orange.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.orange.StockQuoteProvider", "serverSideStreamingGetListStockQuotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.StockQuote.getDefaultInstance()))
                  .setSchemaDescriptor(new StockQuoteProviderMethodDescriptorSupplier("serverSideStreamingGetListStockQuotes"))
                  .build();
          }
        }
     }
     return getServerSideStreamingGetListStockQuotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientSideStreamingGetStatisticsOfStocks",
      requestType = com.orange.Stock.class,
      responseType = com.orange.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod() {
    io.grpc.MethodDescriptor<com.orange.Stock, com.orange.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod;
    if ((getClientSideStreamingGetStatisticsOfStocksMethod = StockQuoteProviderGrpc.getClientSideStreamingGetStatisticsOfStocksMethod) == null) {
      synchronized (StockQuoteProviderGrpc.class) {
        if ((getClientSideStreamingGetStatisticsOfStocksMethod = StockQuoteProviderGrpc.getClientSideStreamingGetStatisticsOfStocksMethod) == null) {
          StockQuoteProviderGrpc.getClientSideStreamingGetStatisticsOfStocksMethod = getClientSideStreamingGetStatisticsOfStocksMethod = 
              io.grpc.MethodDescriptor.<com.orange.Stock, com.orange.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.orange.StockQuoteProvider", "clientSideStreamingGetStatisticsOfStocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.StockQuote.getDefaultInstance()))
                  .setSchemaDescriptor(new StockQuoteProviderMethodDescriptorSupplier("clientSideStreamingGetStatisticsOfStocks"))
                  .build();
          }
        }
     }
     return getClientSideStreamingGetStatisticsOfStocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStreamingGetListsStockQuotes",
      requestType = com.orange.Stock.class,
      responseType = com.orange.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.orange.Stock,
      com.orange.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod() {
    io.grpc.MethodDescriptor<com.orange.Stock, com.orange.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod;
    if ((getBidirectionalStreamingGetListsStockQuotesMethod = StockQuoteProviderGrpc.getBidirectionalStreamingGetListsStockQuotesMethod) == null) {
      synchronized (StockQuoteProviderGrpc.class) {
        if ((getBidirectionalStreamingGetListsStockQuotesMethod = StockQuoteProviderGrpc.getBidirectionalStreamingGetListsStockQuotesMethod) == null) {
          StockQuoteProviderGrpc.getBidirectionalStreamingGetListsStockQuotesMethod = getBidirectionalStreamingGetListsStockQuotesMethod = 
              io.grpc.MethodDescriptor.<com.orange.Stock, com.orange.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.orange.StockQuoteProvider", "bidirectionalStreamingGetListsStockQuotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orange.StockQuote.getDefaultInstance()))
                  .setSchemaDescriptor(new StockQuoteProviderMethodDescriptorSupplier("bidirectionalStreamingGetListsStockQuotes"))
                  .build();
          }
        }
     }
     return getBidirectionalStreamingGetListsStockQuotesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockQuoteProviderStub newStub(io.grpc.Channel channel) {
    return new StockQuoteProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockQuoteProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StockQuoteProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockQuoteProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StockQuoteProviderFutureStub(channel);
  }

  /**
   */
  public static abstract class StockQuoteProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void serverSideStreamingGetListStockQuotes(com.orange.Stock request,
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      asyncUnimplementedUnaryCall(getServerSideStreamingGetListStockQuotesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.orange.Stock> clientSideStreamingGetStatisticsOfStocks(
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientSideStreamingGetStatisticsOfStocksMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.orange.Stock> bidirectionalStreamingGetListsStockQuotes(
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidirectionalStreamingGetListsStockQuotesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServerSideStreamingGetListStockQuotesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.orange.Stock,
                com.orange.StockQuote>(
                  this, METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES)))
          .addMethod(
            getClientSideStreamingGetStatisticsOfStocksMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.orange.Stock,
                com.orange.StockQuote>(
                  this, METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS)))
          .addMethod(
            getBidirectionalStreamingGetListsStockQuotesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.orange.Stock,
                com.orange.StockQuote>(
                  this, METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES)))
          .build();
    }
  }

  /**
   */
  public static final class StockQuoteProviderStub extends io.grpc.stub.AbstractStub<StockQuoteProviderStub> {
    private StockQuoteProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockQuoteProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockQuoteProviderStub(channel, callOptions);
    }

    /**
     */
    public void serverSideStreamingGetListStockQuotes(com.orange.Stock request,
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamingGetListStockQuotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.orange.Stock> clientSideStreamingGetStatisticsOfStocks(
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamingGetStatisticsOfStocksMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.orange.Stock> bidirectionalStreamingGetListsStockQuotes(
        io.grpc.stub.StreamObserver<com.orange.StockQuote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingGetListsStockQuotesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StockQuoteProviderBlockingStub extends io.grpc.stub.AbstractStub<StockQuoteProviderBlockingStub> {
    private StockQuoteProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockQuoteProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockQuoteProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.orange.StockQuote> serverSideStreamingGetListStockQuotes(
        com.orange.Stock request) {
      return blockingServerStreamingCall(
          getChannel(), getServerSideStreamingGetListStockQuotesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StockQuoteProviderFutureStub extends io.grpc.stub.AbstractStub<StockQuoteProviderFutureStub> {
    private StockQuoteProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockQuoteProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockQuoteProviderFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES = 0;
  private static final int METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS = 1;
  private static final int METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockQuoteProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockQuoteProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES:
          serviceImpl.serverSideStreamingGetListStockQuotes((com.orange.Stock) request,
              (io.grpc.stub.StreamObserver<com.orange.StockQuote>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamingGetStatisticsOfStocks(
              (io.grpc.stub.StreamObserver<com.orange.StockQuote>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingGetListsStockQuotes(
              (io.grpc.stub.StreamObserver<com.orange.StockQuote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StockQuoteProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockQuoteProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.orange.StockQuoteProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockQuoteProvider");
    }
  }

  private static final class StockQuoteProviderFileDescriptorSupplier
      extends StockQuoteProviderBaseDescriptorSupplier {
    StockQuoteProviderFileDescriptorSupplier() {}
  }

  private static final class StockQuoteProviderMethodDescriptorSupplier
      extends StockQuoteProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockQuoteProviderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StockQuoteProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockQuoteProviderFileDescriptorSupplier())
              .addMethod(getServerSideStreamingGetListStockQuotesMethod())
              .addMethod(getClientSideStreamingGetStatisticsOfStocksMethod())
              .addMethod(getBidirectionalStreamingGetListsStockQuotesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
