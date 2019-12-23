package com.nettytest.interceptor;

import com.nettytest.demoserver.MessageInput;
import io.netty.channel.ChannelHandlerContext;

// 找不到类型的消息统一使用默认处理器处理
public class DefaultHandler implements IMessageHandler<MessageInput> {

    @Override
    public void handle(ChannelHandlerContext ctx, String requesetId, MessageInput input) {
        System.out.println("unrecognized message type=" + input.getType() + " comes");
    }

}