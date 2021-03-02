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
)


