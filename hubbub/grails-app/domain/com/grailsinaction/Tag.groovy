package com.grailsinaction

class Tag {

   String name
   Date dateCreated

//   static constraints = { content(blank: false) }

   static hasMany = [ posts : Post ]

   static belongsTo = [User, Post]
}
