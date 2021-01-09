package org.spawn.actors

import org.spawn.actors.initializers.ActorInitializer

fun spawn(paramsInitializer: ActorInitializer.() -> Unit) : ActorRef? {
    val actorInitializer = ActorInitializer()
    actorInitializer.paramsInitializer()

    return null
}

fun spawn(system: SpawnSystem, paramsInitializer: ActorInitializer.() -> Unit) : ActorRef? {
    val actorInitializer = ActorInitializer()
    actorInitializer.paramsInitializer()

    return null
}