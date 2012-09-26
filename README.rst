==========
AntiPigman
==========

-----------
Description
-----------

A simple plugin that stops Zombie Pigman from spawning if

* They would spawn on a block other than netherrack or soul sand, AND
* The light level on that block is above 7

In effect, you can now nether bases safe from Zombie Pigman out of say,
cobblestone as long as you light them properly.  I use this specifically
to keep them from spawning in my nether railways.

There is no configuration for this mod.  If you want to customize it,
edit the source.

------------------
Build Instructions
------------------

Build with

    make BUKKITPATH=</path/to/craftbukkit-server.jar>

Of course, don't include the angle brackets.


-------------------------
Installation Instructions
-------------------------

Simply copy the JAR file that is generated (AntiPigman.jar) to your
Bukkit server's plugins directory, then execute reload or restart
the server.  You should see something like:

    09:55:52 [INFO] [AntiPigman] Loading AntiPigman v0.01
    09:55:53 [INFO] [AntiPigman] Enabling AntiPigman v0.01

On your server's console.

-------
License
-------

See COPYING.
