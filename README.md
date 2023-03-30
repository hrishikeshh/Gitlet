# Gitlet

In this project I have implemented a version-control system that mimics some of the basic features of the popular system Git. Mine is smaller and simpler, however, so we have named it Gitlet.

A version-control system is essentially a backup system for related collections of files. The main functionality that Gitlet supports is:

1. Saving the contents of entire directories of files. In Gitlet, this is called *committing*, and the saved contents themselves are called *commits*.
2. Restoring a version of one or more files or entire commits. In Gitlet, this is called *checking out* those files or that commit.
3. Viewing the history of your backups. In Gitlet, you view this history in something called the *log*.
4. Maintaining related sequences of commits, called *branches*.
5. Merging changes made in one branch into another.

### **Internal Structures**
Real Git distinguishes several different kinds of objects. For our purposes, the important ones are

- blobs: Essentially the contents of files.
- trees: Directory structures mapping names to references to blobs and other trees (subdirectories).
- commits: Combinations of log messages, other metadata (commit date, author, etc.), a reference to a tree, and references to parent commits. The repository also maintains a mapping from branch heads (in this course, we’ve used names like master, proj2, etc.) to references to commits, so that certain important commits have symbolic names.

In this project, I had simplified from Git still further by

- Incorporating trees into commits and not dealing with subdirectories (so there will be one “flat” directory of plain files for each repository).
- Limiting ourselves to merges that reference two parents (in real Git, there can be any number of parents.)
- Having our metadata consist only of a timestamp and log message. A commit, therefore, will consist of a log message, timestamp, a mapping of file names to blob references, a parent reference, and (for merges) a second parent reference.
