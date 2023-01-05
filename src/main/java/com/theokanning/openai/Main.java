package com.theokanning.openai;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.edit.EditRequest;
import com.theokanning.openai.moderation.ModerationRequest;

public class Main {
    public static void main(String[] args) {
        var service = new OpenAiService("Input Your API KEY HERE");

        var request = EditRequest.builder()
                .model("text-davinci-edit-001")
                .input("i Jack, I like programn in java, how abt you")
                .instruction("Fix the grammar and spelling mistakes")
                .build();

        service.createEdit(request).getChoices().forEach(System.out::println);


//       var moderationRequest = ModerationRequest.builder()
//               .model("text-moderation-stable")
//               .input("I really want to murder him").build();
//        service.createModeration(moderationRequest).getResults().forEach(System.out::println);


    }
}