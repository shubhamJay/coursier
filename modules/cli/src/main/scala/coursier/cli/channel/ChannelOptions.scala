package coursier.cli.channel

import caseapp.Recurse
import coursier.cli.options.OutputOptions
import caseapp.{ExtraName => Short, HelpMessage => Help, _}

final case class ChannelOptions(
    @Short("a")
    @Help("add channel")
    add: List[String] = Nil,
    @Short("l")
    @Help("lists down all added channels")
    list: Boolean = false,
    @Recurse
    outputOptions: OutputOptions = OutputOptions()
)
