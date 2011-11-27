DELETE FROM BLOG_POST;
DELETE FROM BLOG;

ALTER TABLE BLOG AUTO_INCREMENT = 1;
ALTER TABLE BLOG_POST AUTO_INCREMENT = 1;

INSERT INTO BLOG(VERSION, NAME) VALUES(0, 'JBoss Events Blog');
INSERT INTO BLOG(VERSION, NAME) VALUES(0, 'OpenShift Blog');
INSERT INTO BLOG(VERSION, NAME) VALUES(0, 'The Gothenburg Blog');


INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, '2011-11-22 16:21', 'JUDCon London', 'At JUDCon I was co-hosting the third live JBoss Asylum Podcast together with Emmanuel Bernard. The topic was &quot;Polyglot JBoss&quot; with Marek Goldmann and Galder Zamarreno as guests talking about how JBoss supports, extends and develop on multiple languages outside just Java.<br/>The recording of this is available on JBoss Asylum site or iTunes.<br/><br/>After the panel we got a set of lightning talks done by JBossians and external contributors which I had the pleasure of moderating. Was great fun.<br/>I did the first lightning talk about how you make your examples for your framework/distribution the most accessible to users. Not everyone liked the conclusion, but I got good feedback on the content, thus I re-recorded the audio for this talk.');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, '2011-11-21 13:44', 'EclipseCon', '<p>At Eclipsecon Europe they were celebrating it was 10 years since the first release of Eclipse the IDE. I unfortunately missed out on the party and cake since I was sure the celebration would be on the Thursday not Wednesday. Instead I spent that evening having early dinner with Fred Bricon and then we went separate ways to prepare for our talks the next day.</p><p>Fred did his first public presentation for Red Hat called &quot;Workaround Driven Development: How Maven integrates with Eclipse WTP&quot;. He covered how the m2e-wtp project makes Maven usable in context of Eclipse WTP projects and how it was technically done by bridging Eclipse and Maven&#39;s two different worldviews on projects.</p><p>All during EclipseCon we got very good feedback from users of m2e-wtp and how it was the piece they were missing to actually be productive within their work on enterprise projects - always good to hear we and especially Fred\'s work are making a difference.</p><p>My talk was about the experiences we&#39;ve done with the move to Tycho on the JBoss Tools project. It was hard to boil it down to a 20 minutes presentation but I think I succeded.</p><p>If you want to see and hear the presentation it is available from EclipseCon&#39;s audio/video recordings under: Tycho - The good, the bad and the ugly</p>');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, '2011-11-20 10:52', 'Devoxx', '<p>Devoxx also had its 10th anniversary in Antwerp and I had the pleasure to attend and speak again this year. This year with a quickie  on how to &quot;Deploy Java EE Applications to OpenShift&quot;. I also got to reveal the news and do a demo of the new Jenkins support on OpenShift.</p><p>Devoxx is also the conference in Europe where I get to meet up with many of the JBoss folks speaking there and this year was no exception. What was exceptional this year was though that we had a small booth this year leaving no space for the traditional fussball table. That was no fun.</p>');

INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, '2011-11-17 11:32', 'Running MongoDB on OpenShift Flex', 'With the latest release of OpenShift Flex, running your own MongoDB NoSQL database server is straightforward. I will assume that you already have an OpenShift account, and that you have already used the Flex User Interface to create a cluster on that cloud. When you created your cluster, you set an &quot;Admin Password&quot;. You will need that password later on in this demo.');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, '2011-11-16 13:05', 'Recap of November OpenShift Releases', 'Do you want to get a handle on your AWS charges when using dedicated servers on OpenShift? Would you like to see what you\'ve consumed and also get a projection on how much you may consume the rest of the month? Do you want to set a budget for the month and  periodically track spending against your budget? Look no further, OpenShift Flex now has this functionality built into the UI.');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, '2011-11-14 16:21', 'Jenkins and More! New OpenShift Release', '<p>The OpenShift team is proud to announce we now have a built-in work flow for continuous integration. Our users who are already familiar with Hudson or Jenkins will be pleased to see a fully functional Jenkins environment. Those unfamiliar with continuous integration are in for a real treat.</p><p>With Jenkins, users have access to a full library of plugins and a vibrant thriving community of users who have discovered a new way to do development. The basic work flow is this:</p><ol><li>Commit and push new code to your repo.</li><li>Jenkins waits for this commit, runs a full series of tests (customized by the developer)</li><li>The results are saved in Jenkins for review.</li><li>With OpenShift, if the tests and build are successful, the new code gets deployed. If it fails, the old code continues to run with no downtime related to the push.</li></ol>');

INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, '2011-11-17 18:21', 'Christmas market at Liseberg', '<p>Every year from mid november and up until christmas the amusement park Liseberg turns in to a giantic Christmas market (the biggest Christmas market in Scandinavia) with everything you need to get into the christmas spirit. Liseberg is decorated with millions of spruce garlands and you’ll find around 80 cabins and shops packed with everything that makes Christmas special.</p><p>On of the coolest things during the Christmas period is the "Liseberg Ice Gallery & Bar", it is made entirely out of beautiful shimmering blue ice and all of the interior furnishings, including the drinking glasses, is made of ice.</p><p>So if you\'re in town any time between mid-november and Christmas, stop by at Liseberg and you will be in for a great experience!</p>');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, '2011-11-06 20:51', 'King Gustavus Adolphus - the founder of Gothenburg', '<p>Gothenburg was founded in 1621 by King Gustavus Adolphus (Gustaf II Adolf). You can see a statue of King Gustavus Adolphus on the Gustavus Adolphus square. The statue represents the moment when King Gustavus Adolphus is supposed to have said "This is where the city shall be", and pointing with his hand.</p><p>From wikipedia you can also learn that:</p><blockquote>The city was heavily influenced by the Dutch. Dutch city planners were contracted to build the city as they had the skills needed to build in the marshy areas around the city. The town was planned after Dutch cities to have canals like Amsterdam, and the blueprint for the canals of Gothenburg are actually the same as those used for Jakarta.</blockquote>');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, '2011-10-21 10:45', 'Haga - shoping, cafes and much more', '<p>Haga is one of the oldest parts of Gothenburg, the main street (Haga Nygata) is full of nice shops, cafés and resturants. This is one of my favorite parts of Gothenburg. Just walking up and down the street when the sun is shining is a great experience. Here you will find everything from second hand clothes to antiques to sneakers and cool t-shirts - great shoping in other words. You can also buy the famous "Lejonet & Björnen" ice cream here. It is the very same ice cream that they used to serve at the Nobel Price party in Stockholm.</p>');
