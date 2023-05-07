package com.example.profilecard.data

import com.example.profilecard.MyModelClass

class Data {
    lateinit var dataSource: ArrayList<MyModelClass>
    fun loadData(){
        dataSource = arrayListOf()
        dataSource.add(
            MyModelClass(
                "https://img.bleacherreport.net/img/images/photos/002/702/917/hi-res-461825537-lionel-messi-of-fc-barcelona-leaves-the-vicente_crop_exact.jpg?w=1200&h=1200&q=75",
                "Lionel Messi",
                "lionelmessi10@gmail.com",
                "Argentinian footballer considered one of the greatest players of all time, winner of numerous awards and titles.",
                "79.5M",
                "1",
                "50M",
                "Lionel Messi is an Argentine professional footballer who is widely considered one of the greatest players of all time. He was born on June 24, 1987 in Rosario, Argentina and began playing football at a very young age. Messi made his professional debut for Barcelona in 2004 at the age of 17 and has since become the team's all-time leading scorer. He has won numerous individual awards, including seven Ballon d'Or titles, and has helped Barcelona win numerous domestic and international titles, including four UEFA Champions League titles. Messi is known for his exceptional dribbling skills, his ability to create space on the field, and his impressive goal-scoring ability. Off the field, he is widely respected for his charitable work and dedication to improving the lives of disadvantaged children."
            )
        )
        dataSource.add(
            MyModelClass(
                "https://www.iwmbuzz.com/wp-content/uploads/2020/05/cristiano-ronaldo-and-his-best-fashion-moments-920x518.jpg",
                "Cristiano Ronaldo",
                "cr7@gmail.com",
                "Portuguese footballer widely regarded as one of the greatest players of all time, winner of numerous awards and titles.",
                "70.9M",
                "2",
                "44M",
                "Cristiano Ronaldo is a Portuguese professional footballer widely considered one of the greatest players of all time. He was born on February 5, 1985 on the island of Madeira, Portugal, and began playing football at a young age. Ronaldo made his professional debut for Sporting Lisbon in 2002, and later joined Manchester United in 2003, where he quickly became a star player. He has since played for Real Madrid, Juventus, and Manchester United again, and has won numerous individual awards, including five Ballon d'Or titles. Ronaldo is known for his exceptional speed, strength, and technical ability, as well as his impressive goal-scoring record. He has won numerous domestic and international titles, including five UEFA Champions League titles. Off the field, Ronaldo is actively involved in various charitable endeavors and has used his platform to advocate for social causes."
            )
        )
        dataSource.add(
            MyModelClass(
                "https://e1.pxfuel.com/desktop-wallpaper/73/435/desktop-wallpaper-neymar-in-formal-dress-neymar-style.jpg",
                "Neymar Jr.",
                "neymar10@gmail.com",
                "Brazilian footballer known for his skillful playing style and ability to score goals, currently playing for Paris Saint-Germain.",
                "60.8M",
                "3",
                "48M",
                "Neymar Jr. is a Brazilian professional footballer who currently plays as a forward for Paris Saint-Germain and the Brazilian national team. He was born on February 5, 1992, in Mogi das Cruzes, São Paulo, Brazil. Neymar began playing football at a young age and joined Santos FC at the age of 11. He made his professional debut for Santos at the age of 17 and quickly established himself as one of the top players in Brazil. In 2013, Neymar joined Barcelona, where he formed a formidable attacking trio with Lionel Messi and Luis Suarez, helping the team win numerous domestic and international titles. He later joined Paris Saint-Germain in a record-breaking transfer deal. Neymar is known for his exceptional dribbling skills, his creativity on the ball, and his impressive goal-scoring ability. He has won numerous individual awards, including the South American Footballer of the Year award multiple times. Off the field, Neymar is actively involved in various philanthropic efforts, including his own Neymar Jr. Project Institute, which provides educational opportunities for underprivileged children in Brazil."
            )
        )
        dataSource.add(
            MyModelClass(
                "https://acefootball.com/wp-content/uploads/2021/12/GettyImages-1263055053.jpg",
                "Kylian Mbappe",
                "mbappe10@gmail.com",
                "French footballer known for his speed and goal-scoring abilities, currently playing for Paris Saint-Germain.",
                "58.9M",
                "4",
                "47M",
                "Kylian Mbappe is a French professional footballer who currently plays as a forward for Paris Saint-Germain and the French national team. He was born on December 20, 1998, in Bondy, France. Mbappe began playing football at a young age and joined the youth academy at AS Bondy. He later joined the youth academy at AS Monaco and made his professional debut for the team at the age of 16. In 2017, he joined Paris Saint-Germain in a record-breaking transfer deal. Mbappe is known for his exceptional speed, agility, and technical ability on the ball, as well as his impressive goal-scoring record. He has won numerous domestic and international titles, including the 2018 FIFA World Cup with the French national team, where he was named the tournament's Best Young Player. Mbappe has also won the Ligue 1 Golden Boot multiple times and has been named the French Player of the Year. Off the field, Mbappe is actively involved in various charitable efforts, including his work with the charity Premiers de Cordée, which provides sports opportunities for children with disabilities."
            )
        )
        dataSource.add(
            MyModelClass(
                "https://icdn.psgtalk.com/wp-content/uploads/2019/12/Erling-Braut-Haaland-RB-Salzburg-vs-Liverpool-Champions-League-2019-1020x680.jpg",
                "Erling Haaland",
                "haalandmancity@gmail.com",
                "Norwegian footballer known for his impressive physicality and goal-scoring abilities, currently playing for Man. City",
                "50.9M",
                "5",
                "40M",
                "Erling Haaland is a Norwegian professional footballer who currently plays as a forward for Borussia Dortmund and the Norwegian national team. He was born on July 21, 2000, in Leeds, England, and began his youth career at his local club, Bryne FK. He later joined the youth academy at Molde FK, where his father, Alf-Inge Haaland, also played professionally. Haaland made his professional debut for Bryne FK at the age of 15 and later joined Red Bull Salzburg, where he quickly established himself as a top scorer. In 2020, he joined Borussia Dortmund in a highly publicized transfer deal. Haaland is known for his exceptional pace, power, and technical ability, as well as his impressive goal-scoring record. He has won numerous individual awards, including the Golden Boy award and the Bundesliga Player of the Month award multiple times. Off the field, Haaland is actively involved in various charitable efforts, including his work with the charity Human Race, which provides education and sports opportunities for children in Africa."
            )
        )
    }
}