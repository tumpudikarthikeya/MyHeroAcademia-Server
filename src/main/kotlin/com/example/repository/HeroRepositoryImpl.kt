package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val NEXT_PAGE = "nextPage"
const val PREV_PAGE = "prevPage"

class HeroRepositoryImpl:HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf( 1 to page1 ,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5)}
    override val page1:List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Yagi Toshinori",
            alias = "All Might",
            image = "/images/allmight.jpg",
            about = "Yagi Toshinori, also known as All Might, is the former No. 1 Pro Hero who bore the title of the world's Symbol of Peace. He teaches Foundational Hero Studies at U.A. High School.\n\nAll Might was the eighth holder of the One For All Quirk after receiving it from Nana Shimura. He has since passed the torch to Izuku Midoriya, whom he is training to be his successor. After using up all the embers of One For All to defeat All For One, All Might retired and ended his era as the world's greatest hero.",
            rating = 4.8,
            occupation = "Pro Hero (Formerly) Teacher",
            quirk = "Quirkless (Initially, currently)\n" +
                    "One For All (Formerly)",
            month = "June",
            day = "10",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Melee combat"+ "Long-ranged combat")
        ),
        Hero(
            id = 2,
            name = "Todoroki Enji",
            alias = "Flame Hero: Endeavor",
            image = "/images/endeavor.jpg",
            about = "Enji is a tall, sturdily-built man with a very muscular physique. He has short crimson hair, which he wears spiked up around his head, and sharp turquoise eyes. His beard and mustache appear to be made of fire, but when he voluntarily turns off the flames on his face, a slight amount of stubble shows around his jaw.\n\nTodoroki Enji, also known as Flame Hero: Endeavor, is a Pro Hero known for his powerful Quirk 'Hellflame' and his exceptional combat skills. He is often recognized for his determined and intense personality. Despite being driven by the desire to surpass All Might and become the number one hero, Endeavor has shown growth and attempts to reconcile with his family, striving to become a true hero in their eyes.\n\nAs a Pro Hero, he has been part of the Hideout Raid Team and the Hospital Raid Team. He is the husband of Rei Todoroki and the father of Toya, Fuyumi, Natsuo, and Shoto Todoroki. His past is marked by a complicated family history, with unresolved issues involving his father and family dynamics.\n\nEndeavor is a respected hero within the Endeavor Agency, and his fighting style primarily focuses on close to long-range combat.",
            rating = 4.8, // Rating is from 0 to 5 stars
            occupation = "Pro Hero",
            quirk = "Hellflame",
            month = "August",
            day = "8",
            status = "Alive",
            affiliation = "Endeavor Agency",
            fightingStyle = ("Close to long-range combat")
        ),
        Hero(
            id = 3,
            name = "Aizawa Shōta",
            alias = "Erasure Hero: Eraser Head",
            image = "/images/eraserhead.jpg",
            about = "Shota is a slender and tall, pale-skinned man with messy, shoulder-length black hair that partially hangs in front of his face and half-opened black eyes. He is usually recognized for his worn-out appearance, often looking fatigued. His facial hair is almost always in a stubbly, unkempt state (unless he needs to look good for the press), and his eyes tired and flat, unless he's in combat.\n\nAizawa Shōta, also known as Eraser Head, is a Pro Hero and teacher at U.A. High School. He possesses the Quirk 'Erasure,' which allows him to nullify the Quirks of others by maintaining eye contact with them. Despite his seemingly aloof and stern demeanor, he deeply cares for his students and is willing to put his life on the line to protect them.",
            rating = 4.0,
            occupation = "Pro Hero Teacher",
            quirk = "Erasure",
            month = "November",
            day = "8",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Binding Cloth")
        ),


    )

    override val page2: List<Hero> = listOf(
        Hero(
            id = 4,
            name = "Kayama Nemuri",
            alias = "R-Rated Hero: Midnight",
            image = "/images/midnight.jpg",
            about = "Nemuri was a tall, curvaceous woman with sky blue eyes, which tilted downwards in the center; framed by a set of rather long eyelashes. She had long thick spiky dark purple hair, which was made up of layers of varying lengths, the longest ones reaching down below her waist. Her chin-length bangs were split into three sections; two swept to the sides and one over her face, going diagonally down to the left between her eyes. She also had a small beauty mark below her left eye, as well as red-painted nails.\n\nKayama Nemuri, also known as R-Rated Hero: Midnight, was a Pro Hero and teacher at U.A. High School. She possessed the Quirk 'Somnambulist,' which allowed her to put people to sleep instantly with the breath of her sleep-inducing aroma. Despite her risqué hero costume, she was a skilled combatant and fought using a combination of melee and support combat techniques. Nemuri was admired for her beauty and charm, but she was also a caring and dedicated teacher who deeply cared for her students.\n\nTragically, Nemuri passed away, leaving a void in the hero community.",
            rating = 4.0,
            occupation = "Pro Hero Teacher",
            quirk = "Somnambulist",
            month = "March",
            day = "9",
            status = "Deceased",
            affiliation = "U.A. High School",
            fightingStyle = ("Melee+ Support combat")
        ),
        Hero(
            id = 5,
            name = "Yamada Hizashi",
            alias = "Voice Hero: Present Mic",
            image = "/images/presentmic.jpg",
            about = "Hizashi maintains the eccentric persona of a radio host. He often poses when he talks and maintains a certain level of excitement or volume, regardless of the situation. His attitude made Kyoka Jiro mistake him for a simple announcer, rather than an actual Pro Hero.\n\nYamada Hizashi, also known as Voice Hero: Present Mic, is a Pro Hero, teacher at U.A. High School, and a radio talk show host. He possesses the Quirk 'Voice,' which allows him to amplify and control the volume of his voice, granting him powerful sonic abilities. Present Mic is known for his charismatic and loud personality, and he uses his voice-based powers in long-range combat scenarios. He is admired for his strong presence and unique style, and his voice is considered one of the most recognizable among Pro Heroes.\n\nAs a former member of the Buster Union and the Hospital Raid Team, Present Mic has been involved in various hero activities. He takes his role as a teacher seriously and is dedicated to nurturing the next generation of heroes.",
            rating = 4.3,
            occupation = "Pro Hero Teacher Radio Talk Show Host",
            quirk = "Voice",
            month = "July",
            day = "7",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Long ranged combat")
        ),
        Hero(
            id = 6,
            name = "Shin'ya",
            alias = "Ninja Hero: Edgeshot ",
            image = "/images/edgeshot.jpg",
            about = "Shinya is a slim, muscular man who stands a bit shorter than most of his top-class heroic peers. He has gray hair shaped into three sharp points that cover the right side of his face and dark gray eyes, and he wears a mask over his lower face, covering his nose and mouth. Shinya, also known as Ninja Hero: Edgeshot, is a Pro Hero known for his incredible speed and precision, which earned him the moniker of a ninja hero. He possesses the Quirk 'Foldabody,' which allows him to fold and bend his body at will, granting him enhanced agility and the ability to slip through narrow spaces effortlessly. Edgeshot is highly skilled in close combat and is the leader of the hero team 'The Lurkers.' He was also part of the Hideout Raid Team.\n\nShinya carries an air of mystery and is known for his stealthy approach to hero work, making him one of the top heroes in the industry. Despite his reserved and enigmatic nature, Edgeshot is a dependable and valiant hero who always rises to the occasion when the world needs him.",
            rating = 4.9,
            occupation = "Pro Hero",
            quirk = "Foldabody",
            month = "February",
            day = "22",
            status = "Alive",
            affiliation = "None",
            fightingStyle = ("Close combat")
        ),




        )

    override val page3: List<Hero> = listOf(

        Hero(
            id = 7,
            name = "Midoriya Izuku",
            alias = "Deku",
            image = "/images/deku.jpg",
            about = "Izuku is somewhat short for his age, and his round face is framed by a short mop of fluffy dark-green hair which curls up at odd angles around his head, casting noticeably dark shadows onto itself. His eyes are large and somewhat circular, their irises the same shade of green as his hair, which at times are very watery, and are usually stretched quite wide, giving him an innocent, energized appearance. He has a set of four symmetrical freckles in diamond formations, one on each cheek.\n\nMidoriya Izuku, also known as Deku, is a student at U.A. High School and the inheritor of the Quirk 'One For All,' which he received from his mentor, All Might. Before receiving 'One For All,' Izuku was Quirkless, but he never gave up on his dream of becoming a hero. He has developed several techniques and fighting styles, including the Delaware Smash, Delaware Smash Air Force, St. Louis Smash Air Force, Froppy Style, and Pinpoint Focus. Among his many abilities is the Quirk 'Blackwhip,' which he inherited during his time at U.A. High School.\n\nIzuku is determined, kind-hearted, and always willing to put his life on the line to save others. His journey to become the greatest hero has touched the hearts of many, and he is admired by both his peers and the pro hero community.",
            rating = 4.9,
            occupation = "Student",
            quirk = "One For All",
            month = "July",
            day = "15",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Melee combat"+"Shoot Style"+"Long-ranged combat"+"Delaware Smash"+"Delaware Smash Air Force"+"St. Louis Smash Air Force+ Froppy Style + Pinpoint Focus")
        ),
        Hero(
            id = 8,
            name = "Bakugō Katsuki",
            alias = "Kacchan",
            image = "/images/bakugo.jpg",
            about = "Katsuki is a young man of average height, with a slim, muscular build, and a fair skin tone. He has short, spiky, ash-blond hair with choppy bangs that hang over his eyebrows. His eyes are sharp and bright red in color.\n\nBakugō Katsuki, also known as Kacchan, is a student at U.A. High School and a member of Class 1-A. He possesses the Quirk 'Explosion,' which allows him to secrete nitroglycerin-like sweat from his palms and detonate it at will to create powerful explosions. Katsuki is highly skilled in both melee and ranged combat, utilizing his explosive abilities for offensive and defensive maneuvers. During the U.A. Sports Festival Arc, he briefly possessed the Quirk 'One For All,' inheriting it temporarily from Midoriya Izuku.\n\nDespite his abrasive and confrontational personality, Katsuki is determined and fiercely competitive. He aspires to become the number one hero, surpassing all others, and is known for his powerful will and unyielding determination to win. Kacchan's dynamic and explosive fighting style, as well as his unwavering drive, make him a formidable presence on the hero scene.",
            rating = 4.9,
            occupation = "Student",
            quirk = "Explosion",
            month = "April",
            day = "20",
            status = "Unknown",
            affiliation = "U.A. High School",
            fightingStyle = ("Melee + ranged combat")
        ),
        Hero(
            id = 9,
            name = "Shigaraki Tomura",
            alias = "Symbol of Fear",
            image = "/images/shigaraki.jpg",
            about = "Shigaraki Tomura, whose real name is Tenko Shimura, is a male villain and the main antagonist in the series 'My Hero Academia.' He is the leader of the League of Villains and is known as the 'Symbol of Fear.' His main goal is to kill All Might, the 'Symbol of Peace,' and bring down the society he represents.\n\nShigaraki possesses the Quirk 'Decay,' which allows him to disintegrate anything he touches with all five fingers of his right hand. Later in the series, he inherits the Quirk 'All For One' from his adoptive father, All For One, granting him access to various stolen Quirks.\n\nBorn on April 4, he is currently 21 years old. Shigaraki's appearance includes white hair, red eyes, and a somewhat slender build. He stands at a height of 175.26cm (5'9) and weighs approximately 59.8kg (131 lbs). His hair and eye colors have changed in the past, originally being light blue and gray, respectively, before turning white and red. His fighting style involves both close and long-range combat, making him a formidable adversary.\n\nShigaraki's tragic past includes losing his family at a young age, and he was raised by his master, All For One, to become a powerful villain. He later merged his organization, the League of Villains, with the Meta Liberation Army, forming the Paranormal Liberation Front, where he becomes the Grand Commander. As the series progresses, Shigaraki's character undergoes significant development, and he becomes a central figure in the plot as a key antagonist.",
            rating = 4.9,
            occupation = "Villain",
            quirk = "Decay\nAll For One\nVarious stolen Quirks",
            month = "April",
            day = "4",
            status = "Alive",
            affiliation = "Paranormal Liberation Front",
            fightingStyle = ("Close and long-range combat")
        ),

    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Asui Tsuyu",
            alias = "Froppy",
            image = "/images/froppy.png",
            about = "Asui Tsuyu, also known as Froppy, is the Rainy Season Hero. She is a student at U.A. High School, training to become a Pro Hero. Tsuyu has the Frog Quirk, which grants her frog-like abilities.",
            rating = 4.0,
            occupation = "Student",
            quirk = "Frog",
            month = "February",
            day = "12",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Melee + support combat")
        ),
        Hero(
            id = 11,
            name = "Shoto Todoroki",
            alias = "Shoto",
            image = "/images/shoto.jpg",
            about = "Shoto Todoroki (轟とどろき焦しょう凍と Todoroki Shōto?), also known as Shoto (ショート Shōto?), is the tritagonist of the My Hero Academia manga and anime series.\n\nHe is a student in Class 1-A at U.A. High School, where he got in through official recommendations[3] and is training to become a Pro Hero. He is the youngest son of Endeavor, the former No. 2, and current No. 1, Pro Hero.",
            rating = 4.5,
            occupation = "Student",
            quirk = "Half-Cold Half-Hot",
            month = "January",
            day = "11",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = ("Long-ranged combat")
        ),
        Hero(
            id = 12,
            name = "Takami Keigo",
            alias = "Wing Hero: Hawks",
            image = "/images/hawks.png",
            about = "Takami Keigo, also known as Hawks, is a male Pro Hero in the series 'My Hero Academia.' He holds the title of 'Wing Hero' and is known for his impressive wings and flying abilities. Keigo is 22 years old at his first appearance and currently 23 years old.\n\nHawks has a slim and narrow build, standing at an average height of 172cm (5'7 ¾\"). He has feathery, ash blond hair that is swept messily backward, with some front tufts sticking up in arcs above his head. His eyebrows are notably thick and share a similar texture with his hair. He has gold-colored eyes and a faint stubble on his chin.\n\nBorn on December 28 in Fukuoka, Hawks possesses a Quirk formerly known as 'Fierce Wings,' which granted him impressive wings capable of flying at high speeds. However, he later underwent a procedure to have his wings removed, leaving him Quirkless.\n\nHawks is highly skilled in ranged combat and provides support to other heroes due to his ability to fly and scout from the air. He was associated with the Hero Public Safety Commission and served as a spy within the Paranormal Liberation Front, a villain organization. Despite being a hero, Hawks has been involved in complex political situations, which put him in challenging circumstances.\n\nHawks' unique combination of heroism, intelligence, and political awareness has made him a significant character in the series, and he is widely recognized for his contributions to the hero society.",
            rating = 4.9, // Rating is from 0 to 5 stars
            occupation = "Pro Hero",
            quirk = "Fierce Wings (Formerly)\nQuirkless",
            month = "December",
            day = "28",
            status = "Alive",
            affiliation = "Hero Public Safety Commission (Formerly)",
            fightingStyle = "Ranged + support combat"
        ),

    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Uraraka Ochako",
            alias = "Uravity",
            image = "/images/uraraka.png",
            about = "Ochaco is a short girl with a curvy figure, fair skin, and auburn hair with eyes that match in color. She has perpetual pink blush on her cheeks, and her eyes are large and round with thick upper lashes, two more extended and more prominent ones on either side and fewer but more individually pronounced lower lashes. Her hair is shoulder-length with short bangs, and the style is bobbed with two long strands framing her face. She has small, thick pads on her fingertips similar to the digits of an animal's paws; she uses these when activating and deactivating her Quirk.\n\nUraraka Ochako is a student at U.A. High School and a member of Class 1-A. She possesses the Quirk 'Zero Gravity,' which allows her to make any object she touches float and become weightless. Ochaco is highly skilled in melee combat and support combat, using her Quirk creatively in battles to manipulate gravity and control the movement of objects and opponents. She is known by her hero name 'Uravity,' a combination of her last name and the word 'gravity.'\n\nDespite her cute appearance, Ochaco is determined and hardworking, aiming to become a pro hero to support her family financially. She has a friendly and caring nature, making her popular among her peers and admired for her positive attitude and strong sense of justice.",
            rating = 4.8,
            occupation = "Student",
            quirk = "Zero Gravity",
            month = "December",
            day = "27",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = "Melee + support combat"+"Gunhead Martial Arts"
        ),
        Hero(
            id = 14,
            name = "Tokoyami Fumikage",
            alias = "Jet-Black Hero: Tsukuyomi",
            image = "/images/darkshadow.jpg",
            about = "Tokoyami Fumikage, also known as Tsukuyomi, is a male student at U.A. High School in the series 'My Hero Academia.' He is 15 years old at his first appearance and currently 16 years old. Fumikage is a short young man with the head of a black bird, resembling that of a crow or a raven.\n\nHe has red eyes with a small black pupil, one on each side of his head, and a tan, yellowish beak, slightly hooked down at the end. Despite the appearance of his head, the rest of his body looks like that of a normal human, with fair skin. After his internship training with Hawks, Fumikage has become more muscular. He has a red choker around his neck, which he rarely removes.\n\nBorn on October 30 in Shizuoka Prefecture, Fumikage possesses the Quirk 'Dark Shadow.' This Quirk allows him to manifest a sentient and shadowy being from his body that can attack independently or merge with him to enhance his abilities. He is highly skilled in melee combat and can create a dark abyss with the power of his Quirk.\n\nFumikage is a student at U.A. High School, where he undergoes training to become a professional hero. He is associated with Class 1-A and has showcased his potential as a hero with remarkable abilities and a unique appearance.\n\nHis dark and mysterious appearance, combined with his strong Quirk, has made Fumikage a memorable and valuable member of the hero course at U.A. High School.",
            rating = 4.8,
            occupation = "Student",
            quirk = "Dark Shadow",
            month = "October",
            day = "30",
            status = "Alive",
            affiliation = "U.A. High School",
            fightingStyle = "Melee combat"+ "Black Abyss"
        ),
        Hero(
            id = 15,
            name = "Dabi",
            alias = "Dabi",
            image = "/images/dabi.jpg",
            about = "Dabi is a reasonably tall, pale young man of a slim shape but somewhat muscular build, described as in his early twenties. He has white hair with a few red flecks at its crown that spikes upward around his head, hanging low over his eyes, which are thin, turquoise, and heavily lidded. Dabi's hair was dyed black before revealing his true identity.\n\nDabi's real name is Toya Todoroki (轟とどろき燈とう矢や Todoroki Tōya?). He is the eldest son of Enji Todoroki, also known as the hero Endeavor, and Rei Todoroki. Dabi possesses the Quirk 'Blueflame,' which allows him to generate and control blue flames. He is a villain and was associated with the League of Villains, where he was the leader of the Vanguard Action Squad. However, later on, he becomes a lieutenant and co-commander of the Violet Regiment within the Paranormal Liberation Front, a group led by Tomura Shigaraki.\n\nDabi's actions and motives are shrouded in mystery, and he holds a deep grudge against his father, Endeavor, due to his troubled past. He plays a significant role in the series, particularly during the Endeavor Agency Arc and beyond, where his true identity and intentions become a focal point of the story.",
            rating = 4.8, // Rating is from 0 to 5 stars
            occupation = "Villain",
            quirk = "Blueflame",
            month = "January",
            day = "18",
            status = "Alive",
            affiliation = "Paranormal Liberation Front",
            fightingStyle = "Long-ranged combat"
        )


    )
    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(success = true,
            message = "ok",
            prevPage = calcPages(page = page)[PREV_PAGE],
            nextPage = calcPages(page = page)[NEXT_PAGE],
            heroes = heroes[page]!!)

    }
    private fun calcPages(page :Int): Map<String,Int?>{
        var prevPage:Int? = page
        var nextPage :Int?= page
        if (page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if (page in 1..4){
            nextPage = nextPage?.plus(1)
        }
        if (page == 1){
            prevPage = null
        }
        if (page == 5){
            nextPage = null
        }
        return mapOf(PREV_PAGE to prevPage , NEXT_PAGE to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(name = name)
        )
    }
    private fun findHeroes(name: String?) : List<Hero> {
        val founded = mutableListOf<Hero>()
        return if(! name.isNullOrEmpty()){
            heroes.forEach { (_,heroes) ->
                heroes.forEach {hero ->
                    if (hero.name.lowercase().contains(name.lowercase()) or hero.alias.lowercase().contains(name.lowercase())){
                        founded.add(hero)
                    }
                }

            }
            founded
        }
        else{
            emptyList()
        }
    }
}