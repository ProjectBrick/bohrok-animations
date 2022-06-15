# Relative Path Text Loading

Uses of `loadVariables` like the following example were changed in each file.

Original:

```
loadVariables("/" add language add "/bionicle/recentupdates/episode1.txt", "/");
```

Modified:

```
loadVariables("episode1.txt","/");
```
