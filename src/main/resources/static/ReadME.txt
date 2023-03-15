To see the issues that I am getting, Check out resources/static/images. 
I have each screen shot labeled in order of how to get these issues to show up.

I have this project wired up to mySQL to act as the local host to store the information. 

-----------------------------------------------------

The particular files I suspect are...

src/
-controllers/FeedController
-data/PostRepository (Maybe?)
-models/Post & models/IdGenerator

resources/templates/
-feed/feed

-----------------------------------------------------

The general problem:

-After doing the bootrun and have the code running, I go to the Feed page and when
I make a post, I get the white label error when I try to enter any chars that aren't 
numbers. So if I try to write a message, BOOM, error. But, when I just type in numbers
into the text box, everything will post just fine to mySQL. 

-I have looked over the code in controllers/FeedController and models/Post to see if I
accidently put an Integer in instead of String, but no luck. When I look at the templates/feed/feed.html, I haven't seen anything that suggest I am doing it wrong.

-Post would do what it was suppose to prior to connecting it to MySQL and setting up
the new data Interfaces, UserRepository and PostRepository under data. 

-When I go to look for help on Google, I have not had any luck figuring out what to ask
it to see if anyone else has experienced my issue. I am sure someone has and I would bet
it is gonna be something silly. 