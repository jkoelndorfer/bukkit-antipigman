AntiPigman.jar: AntiPigman.class plugin.yml
	jar -cmf com/github/jkoelndorfer/bukkit/manifest.txt AntiPigman.jar com/github/jkoelndorfer/bukkit/*.class plugin.yml;

AntiPigman.class:
	cd com/github/jkoelndorfer/bukkit; javac -classpath $(BUKKITPATH) AntiPigman.java
