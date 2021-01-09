package org.spawn.actors

interface ActorRef {
    val id: String // TODO: Like Erlang PID <0.111.0> or Erlang epmd nonode@nohost or mixture of both?

    fun tell(message: Any)
    
    fun tell(message: Any, replyTo: ActorRef)
}