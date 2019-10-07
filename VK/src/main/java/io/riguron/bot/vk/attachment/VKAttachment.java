package io.riguron.bot.vk.attachment;

import com.vk.api.sdk.queries.messages.MessagesSendQuery;
import io.riguron.bot.api.attachment.MessageAttachment;


public abstract class VKAttachment implements MessageAttachment {

    private MessagesSendQuery query;

    @Override
    public void caption(String captionText) {
        this.query.message(captionText);
    }

    public void setQuery(MessagesSendQuery query) {
        this.query = query;
    }

    public abstract String attachmentString();

}