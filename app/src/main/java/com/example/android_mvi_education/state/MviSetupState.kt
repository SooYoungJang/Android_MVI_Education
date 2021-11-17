data class MviSetupState(
    override val loading: Boolean = true,
    override val exception: Exception? = null,
    val aouthToken: String = "",
    val userName: String = "",
    val profileImageUrl: String = "",
) : MviBaseState

sealed class MviSetupSideEffect {
    data class SaveData(val data: GithubData) : MviSetupSideEffect()
}