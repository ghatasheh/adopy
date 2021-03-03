/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.features.list.data

data class Dog(
    val name: String,
    val breed: String,
    val imageUrl: String,
    val age: String,
    val gender: Gender,
    val suitability: String,
    val liveWithAnotherDog: String,
    val liveWithCats: String,
    val date: String,
    val description: String
)

sealed class Gender {
    object Male : Gender()
    object Female : Gender()
}

val dogsList = listOf(
    Dog(
        "Yinu",
        "Jack Russell Terrier",
        "https://www.dspca.ie/wp-content/uploads/2021/02/Yinu_1.png",
        "4 years",
        Gender.Female,
        "Children 10+",
        "Yes - A quiet laid back dog",
        "No",
        "26 February 2021",
        "This sweet little lady is Yinu. Yinu is here at the shelter looking for a second chance of happiness. She was part of a loving home and was so well cared for and loved but sadly due to a change in her family’s circumstances she can no longer stay with them. Yinu is sad and confused and doesn’t understand why she is here as she did nothing wrong.  She is just so sweet and is going to make a wonderful addition to a kind and caring family. She is good with other dogs but doesn’t go looking to play and prefers to watch the plays and will join in if it’s not too rough. She doesn’t really like lively active bouncy dogs in her face. She will come to you for cuddles, she loves being beside her human. She seems older than her 4 years and enjoys pottering around the garden. We hope she won’t be too long with us as she is a little stressed in a shelter environment. She needs a calm quiet home who will give her time and space to settle into her life.\n" +
            "\n" +
            "Terriers are a fun active breed. They have lots of energy and love their walks and off lead time.  They love to learn and like to please. Even though most terriers are small don’t let that fool you – they have lots of energy! Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners. "
    ),
    Dog(
        "Bob Marley",
        "Terrier",
        "https://www.dspca.ie/wp-content/uploads/2021/02/Bob-Marley-scaled.jpg",
        "2 Years",
        Gender.Male,
        "Adults Only (nervous of men)",
        "Yes",
        "No",
        "16 February 2021",
        "This handsome guy is Bob Marley. He came into the shelter as a stray and was severely matted. He has received a nice tidy up from our vets and is now feeling much more comfortable! Bob can be a little nervous when meeting people at first, particularly men. He will need am experienced owner who will be willing to give him time to settle and will be committed to spending time training to build his confidence. With a little time and someone who will not over crowd him, once he comes out of his shell he comes seeking cuddles. This may take a day, a week or more.  He will need a patient owner who will help him when meeting strangers and appreciate when guests call over Bob may prefer to have a safe zone to retreat to.\n" +
            "\n" +
            "Terriers are a fun active breed. They have lots of energy and love their walks and off lead time.  They love to learn and like to please. Even though most terriers are small don’t let that fool you – they have lots of energy! Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners."
    ),
    Dog(
        "Spike",
        "Terrier",
        "https://www.dspca.ie/wp-content/uploads/2021/01/Spike.jpg",
        "8 years",
        Gender.Male,
        "Adults Only (nervous of men)",
        "No",
        "No",
        "14 January 2021",
        "This cheeky face belongs to Spike. This little guy came into the shelter as his owner could no longer care form him. He was underweight and had really bad skin and hair loss. He has responded very well to treatment and is now looking as handsome as ever and ready to find a loving home. Although he is an older boy he is full of life and has lots of energy. Spike will need a patient owner who will help with his lead manners.\n" +
            "\n" +
            "Spike absolutely adores affection and is a real cuddle bug. He is however afraid and nervous around men and so a female owner would be great for him. On the lead he does react to other dogs but is very responsive to training so his new owner must commit to continuous training to help him become more relaxed while out walking. He likes to sit up on your knee for pets and will listen to all your stories. Spike is toilet trained too.\n" +
            "\n" +
            "Terriers are a fun active breed. They have lots of energy and love their walks and off lead time.  They love to learn and like to please. Even though most terriers are small don’t let that fool you – they have lots of energy! Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners. "
    ),
    Dog(
        "Trigger",
        "Bull Breed",
        "https://www.dspca.ie/wp-content/uploads/2021/01/Trigger_4.jpg",
        "4 years",
        Gender.Male,
        "Adults 18+",
        "Possibly",
        "No",
        "10 November 2020",
        "Our inspectors were called to collect an injured dog from the pound, they had no idea what to expect and then they saw Trigger.\n" +
            "\n" +
            "Trigger was found as a stray with multiple wounds to his head. His wounds were infected and there were maggots visibly crawling on him. The discharge all round his wounds smelt really bad and there was a bone protruding from his skull. His face was swollen, he was underweight and completely shut down. To say Trigger was in pain was an understatement.\n" +
            "\n" +
            "Trigger was a very good patient and was happy for the vets to handle him and dress his wounds. After months of treatment and heeling  is now ready to find a home of his very own. He is suitable to an adult only home and although he is good with most dogs, he is best suited as the only dog in his home. He needs an owner who has experience with large dogs. He is a restricted breed and will need to wear a muzzle and always be kept on lead in any public place.\n" +
            "\n" +
            "He loves his food, in fact we would say he’s obsessed with it which is great for training! He has yet to learn that he will be fed every day and will not be starved like he was before. Trigger likes to beg for food a lot and he can be very vocal when doing so. He will pretty much sing for his supper and will rob food from anywhere! He’s a very nosey boy and has his nose into everything,  He’s a big face licker too – so be warned for lots of sloppy kisses.\n" +
            "\n" +
            "He is still like a big puppy and will play bite when excited. He spent some time in a foster home for Christmas. He was very good 90% of the time but as he settled in and became more confident with his foster family and he wanted more attention from and this is when the play biting started. He does respond well to training and he still needs work on this. He is being crate trained so that when he does get over excited or demanding of more attention he can chill out in his crate with a nice tasting KONG instead. Trigger will need an owner who will commit on-going training with him through the DSPCA.\n" +
            "\n" +
            "For what he has been though Trigger is so forgiving and is finally learning what it’s like to be loved, wanted, have a snuggly bed and a full belly going to bed every night. He deserves to be happy.\n" +
            "\n" +
            "Bull breeds are a fantastic gentle misunderstood breed. They make wonderful pets. As adults dogs they enjoy long walks but also love nothing more than to lie on the couch and enjoy really good cuddles. They can be strong on the lead but with the right harness they are no problem at all to walk. Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners. \n" +
            "\n"
    ),
    Dog(
        "Phats",
        "Jack Russel / Chihuahua",
        "https://www.dspca.ie/wp-content/uploads/2021/03/Phats-scaled.jpg",
        "2 years",
        Gender.Male,
        "Adults Only",
        "No",
        "No",
        "01 March 2021",
        "Meet Phats. Phats was surrendered to the shelter as his owner could no longer care for him. He was living in a multi-dog household but was not getting along with all of the other dogs. He is a very nervous little man and would best suit a quiet home as the only dog. Someone who has experience with nervous dogs would be ideal.\n" +
            "\n" +
            "Terriers are a fun active breed. They have lots of energy and love their walks and off lead time.  They love to learn and like to please. Even though most terriers are small don’t let that fool you – they have lots of energy! Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners."
    ),
    Dog(
        "Margie",
        "Lurcher",
        "https://www.dspca.ie/wp-content/uploads/2021/03/Margie-scaled.jpg",
        "3 years",
        Gender.Female,
        "Children 6+",
        "Yes",
        "No",
        "10 February 2021",
        "Margie was adopted from the DSPCA 2 years ago. Sadly due to an illness in her family she has been returned to our care. She was a very much loved part of the family during this time. Margie is a sweet girl who loves to play with other dogs, according to her family she has never met a person or dog that she did not like. She has had a basic level of training from attending DSPCA Dog Training classes with her previous owners but would benefit from training with her new owners so that they can learn what she already knows. Margie has lived with a young child for 2 years so would be ok in a home with children who were comfortable with her size.\n" +
            "\n" +
            "Lurchers are very affectionate and love human company. They love nothing more than lounging on the couch or a comfy bed after their exercise. They love to and need to run off lead in an enclosed safe environment. They burn energy very quickly but will happily do 2 x 45mins-1 hour walks daily. They can be vocal when playing and love playing “bitey face” with other dogs. They do feel the cold and need a coat in colder weather. Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners."
    ),
    Dog(
        "Rocco",
        "German Shepherd",
        "https://www.dspca.ie/wp-content/uploads/2021/02/Rocco.jpg",
        "3 years",
        Gender.Male,
        "Adults 16+",
        "Yes - Under Supervision",
        "No",
        "10 February 2021",
        "This stunning boy is Rocco. He is here at the DSPCA so that he can find a loving home. Unfortunately his previous owner was no longer able to care for him. He is very sweet boy and so much fun. He has played well with other dogs in the shelter and loves playing chasing with them. He is a active boy and will need an active family. He will make a great family pet.\n" +
            "\n" +
            "German Shepherds are one of the most intelligent breeds. They are so smart and need an owner who understands this and can cater to their needs. They absolutely love to learn and can learn quickly. They are very loyal and make great companions. They look up to their owners and will always aim to please. They do wonderful at agility! Adult training classes will help dogs settle into family life. Continuous training is also very important for dogs and their owners. "
    )
)
